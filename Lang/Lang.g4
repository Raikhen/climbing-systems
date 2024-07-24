grammar Lang;

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
LENGTH_UNIT: 'cm' | 'm' | 'ft' | 'in';
ANGLE_UNIT: 'deg';
MASS_UNIT: 'g' | 'kg';
YDS_GRADE : ('5.' [0-9] ('+' | '-' | )) | ('5.1' [0-5] ('+' | '-' | [a-d] | )) | '4th' | '3rd';
FRENCH_GRADE: [123] | [45][abc] | [678][abc] ('+')? | '9'[ab] ('+')? | '9c';

// Whitespace and comments
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;



/* PARSER GRAMMAR -> putting it all together */

// file : block EOF;
// block : named_declaration | func_def | func_call;

start: definition* setup;
definition: DEFINE ID block;
// for ex: set lulu_climbing_setup
setup: SET ID;

// Blocks and declarations
block: '{' statement* '}';
statement: assignment | object_creation | method_call;

assignment: ID '=' expr;
object_creation: ID '{' property* '}';
method_call: ID '(' param* ')';

property: (ID ':' expr);
param: ID ':' expr;

// Expressions
expr: ID | NUMBER | length | angle | grade | object;

length : NUMBER LENGTH_UNIT;
angle: NUMBER ANGLE_UNIT;
grade: YDS_GRADE | FRENCH_GRADE;
object: ID '{' (property | object_creation)* '}';


// for ex: define lulu_climbing_setup
DEFINITION: DEFINE ID;