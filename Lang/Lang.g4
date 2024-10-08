grammar Lang;

// Listener
file        : block EOF;
block       : statement* ;
statement   : declaration | func_def | func_call | assignment ;

// Functions
func_def            : 'define' ID '(' def_param_list? ')' '{' block '}' ;

func_call           : ID '(' param_list? ')' ; // ID '(' mixed_param_list? ')' ;

mixed_param_list    : named_param_list
                    | param_list
                    | param_list ',' named_param_list
                    ;

named_param_list    : attribute_pair
                    | attribute_pair ',' named_param_list
                    ;

def_param_list      : ID
                    | ID ',' def_param_list
                    ;

param_list          : expr
                    | expr ',' param_list
                    ;

// Assignment
assignment      : ref '=' expr ;
declaration     : CLASS ID? ('{' attribute_list '}')? ;
attribute_list  : attribute_pair* ;
attribute_pair  : attribute ':' expr ;

// Expressions and identifiers
expr        : ref_val
            | declaration
            | list
            | tuple
            | grade
            | constant
            | math_expr
            | func_call
            | LENGTH
            | STRING
            | ANGLE
            | CAM_SIZE
            ;

list        : '[' expr_seq ']' ;
tuple       : '(' expr_seq ')' ;

expr_seq    : expr
            | expr ',' expr_seq
            |
            ;

attribute   : ID;

ref         : ID
            | ID '.' ref
            ;

ref_val     : ref ;

grade       : YDS_GRADE | FRENCH_GRADE ;

constant    : ROUTE_STYLES
            | ROPE_RATINGS
            | ANCHOR_SYSTEMS
            | DRAW_TYPES
            | CARABINER_TYPES
            | knots
            ;

knots       : PROPER_KNOTS
            | BENDS
            | HITCHES
            | OTHER
            ;

// Handling of mathematical expressions
math_expr   : term terms;

terms       : '+' term terms
            | '-' term terms
            |
            ;

term        : factor factors;

factors     : '*' factor factors
            | '/' factor factors
            |
            ;

factor      : '(' math_expr ')'
            | ref_val | LENGTH
            | NUM
            ;

// Terminals
CLASS           : 'Rope'
                | 'Route'
                | 'Attachment'
                | 'Climber'
                | 'Knot'
                | 'Carabiner'
                | 'GriGri'
                | 'Vector'
                | 'ProPossibility'
                | 'Protection'
                | 'Bolt'
                | 'RapRing'
                | 'Cam'
                | 'Draw'
                | 'DyneemaSling'
                | 'AnchorSystem'
                ;

ROUTE_STYLES    : 'MIXED' // Both trad and sport, no ice stuff for now
                | 'TRAD'
                | 'SPORT'
                ;

ROPE_RATINGS    : 'SINGLE'
                | 'TAG_LINE'
                | 'HALF'
                | 'TWIN'
                | 'DOUBLE' // Both half and twin?
                ;

ANCHOR_SYSTEMS  : 'QUAD'
                | 'SLIDING_X'
                | 'W_ANCHOR' // Is there a better name?
                ;

DRAW_TYPES      : 'SPORT_DRAW'
                | 'ALPINE_DRAW'
                ;

CARABINER_TYPES : 'LOCKING'
                | 'NON_LOCKING'
                ;

PROPER_KNOTS    : 'BARREL'
                | 'OVERHAND_ON_A_BIGHT'
                | 'FIGURE_EIGHT_ON_A_BIGHT'
                | 'FIGURE_EIGHT_FOLLOW_THROUGH'
                | 'BUTTERFLY'
                | 'MUNTER_MULE_OVERHAND'
                ;

BENDS           : 'DOUBLE_FISHERMAN'
                | 'TRIPLE_FISHERMAN'
                | 'FLAT_OVERHAND'
                | 'FLEMISH'
                ;

HITCHES         : 'CLOVE'
                | 'PRUSIK'
                | 'AUTOBLOCK'
                | 'KLEMHEIST'
                | 'MUNTER'
                ;

OTHER           : 'TANGLE'
                ;

STRING          : '\'' .*? '\'' ;
LENGTH          : [0-9]+ ('cm' | 'm' | 'ft' | 'in') ;
ID              : [a-z] ([a-z] | [0-9] | '_')* ;
YDS_GRADE       : ('5.' [0-9] ('+' | '-')?) | ('5.1' [0-5] ('+' | '-' | [a-d])?) | '4th' | '3rd' ;
FRENCH_GRADE    : 'FRENCH' ' '? ([123] | [45][abc] | [678][abc] ('+')? | '9'[ab] ('+')? | '9c');
ANGLE           : '-'? [0-9]+ 'deg' ;
WEIGHT          : [0-9]+ ('g' | 'kg') ;
CAM_SIZE        : '.'[1-5] | '.75' | '#'[1-8] ;
NUM : [0-9]+;

// Whitespace and comments
WS              : (' ' | '\t' | '\n' | ';') -> skip ;
COMMENT         : '//' ~[\r\n]* -> skip ;
BLOCKCOMMENT    : '/*' .*? '*/' -> skip ;
