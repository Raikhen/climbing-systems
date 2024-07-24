grammar Lang;

// Main
file        : block EOF;
block       : statement* ;
statement   : declaration | func_def | func_call | assignment ;

// Functions
func_def            : 'define' ID '(' param_list ')' '{' block '}' ;

<<<<<<< HEAD
func_call           : 'set' ID '(' named_param_list ')';

named_param_list    : attribute_pair
                    | attribute_pair ',' named_param_list
                    |
                    ;

param_list          : ID
                    | ID ',' param_list
                    |
                    ;

// Assignment
assignment      : id '=' expr;
declaration     : CLASS ID? ('{' attribute_list '}')? ;
attribute_list  : attribute_pair* ;
attribute_pair  : attribute ':' expr;

// Expressions and identifiers
expr        : id
            | declaration
            | (declaration '.' attribute)
            | list
            | tuple
            | grade
            | constants
            | LENGTH
            | STRING
            | ANGLE
            | CAM_SIZE
            ;

list        : '[' expr_seq ']';
tuple       : '(' expr_seq ')';

expr_seq    : expr
            | expr ',' expr_seq
            |
            ;

attribute   : ID;

id          : ID
            | ID '.' id
            ;

grade       : YDS_GRADE | FRENCH_GRADE ;

constants   : ROUTE_STYLES
            | ROPE_RATINGS
            | ANCHOR_SYSTEMS
            | DRAW_TYPES
            | CARABINER_TYPES
            | knots
            ;

knots       : PROPER_KNOTS
            | BENDS
            | HITCHES
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
                | 'NON-LOCKING'
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

STRING          : '\'' .*? '\'' ;
LENGTH          : [0-9]+ ('cm' | 'm' | 'ft' | 'in') ;
ID              : [a-z] ([a-z] | [0-9] | '_')* ;
YDS_GRADE       : ('5.' [0-9] ('+' | '-')?) | ('5.1' [0-5] ('+' | '-' | [a-d])?) | '4th' | '3rd' ;
FRENCH_GRADE    : [123] | [45][abc] | [678][abc] ('+')? | '9'[ab] ('+')? | '9c' ;
ANGLE           : '-'? [0-9]+ 'deg' ;
WEIGHT          : [0-9]+ ('g' | 'kg') ;
CAM_SIZE        : '.'[1-5] | '.75' | '#'[1-8] ;

// Whitespace and comments
WS              : (' ' | '\t' | '\n') -> skip ;
COMMENT         : '//' ~[\r\n]* -> skip ;
BLOCKCOMMENT    : '/*' .*? '*/' -> skip ;
=======
/* LEXER GRAMMAR -> Keywords */
DEFINE: 'define';
SET: 'set';
PROTECTION: 'Protection';
VECTOR: 'Vector';
ROUTE: 'Route';
CLIMBER: 'Climber';
ROPE: 'Rope';
KNOT: 'Knot';
CARABINER: 'Carabiner';
ATTACHMENT: 'Attachment';
GEAR: 'gear';
TYPE: 'type';
ANGLE: 'angle';
LENGTH: 'length';
GRADE: 'grade';
NAME: 'name';
WITH: 'with';
ON: 'on';
TO: 'to';
CLIPPED_TO: 'clipped_to';
DEVICE: 'device';
ACTIVE_SIDE: 'active_side';
DISTANCE_TO_END: 'distance_to_end';
LOCKING: 'LOCKING';

// Identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
UNIT: 'cm' | 'm' | 'ft' | 'in';


yds_grade : YDS_GRADE;
length : NUMBER UNIT;

// for ex: set lulu_climbing_setup
setup: SET ID;

// for ex: define lulu_climbing_setup
DEFINITION: DEFINE ID;

YDS_GRADE : ('5.' [0-9] ('+' | '-' | )) | ('5.1' [0-5] ('+' | '-' | [a-d] | )) | '4th' | '3rd';
>>>>>>> origin/sebwork
