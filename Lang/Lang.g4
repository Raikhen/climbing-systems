grammar Lang;

// file : block EOF;
// block : named_declaration | func_def | func_call;

declaration : CLASS (ID |) '{\n' attribute_list ;
attribute_list : (attribute_pair '\n')* ;

attribute_pair : attribute ':' expr;

expr : ID | declaration | (declaration '.' attribute) | list | numerical;

numerical : LENGTH; // Extend

list: '[' expr_seq ']';

expr_seq    : expr
            | expr ',' expr_seq
            |
            ;

attribute : ID;

LENGTH  : [0-9]+ ('cm' | 'm' | 'ft' | 'in');

CLASS   : 'Rope'
        | 'Route'
        | 'Attachment'
        | 'Climber'
        | 'Knot'
        | 'Carabiner'
        | 'GriGri'
        | 'Vector'
        | 'ProPossibility'
        ;

ID : [a-z] ([a-z] | [0-9] | '_')* ;
YDS_GRADE : ('5.' [0-9] ('+' | '-' | )) | ('5.1' [0-5] ('+' | '-' | [a-d] | )) | '4th' | '3rd';
NUMBER: [0-9]+;
UNIT: 'cm' | 'm' | 'ft' | 'in';
WS : (' ' | '\t') -> skip;