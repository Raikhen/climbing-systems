grammar Lang;

// file : block EOF;

// block : named_declaration | func_def | func_call;

// LEXER GRAMMAR -> Keywords
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

ID: [a-zA-Z_][a-zA-Z0-9_]*;


yds_grade : YDS_GRADE;
length : LENGTH;

// for ex: set lulu_climbing_setup
setup: SET ID;

// for ex: define lulu_climbing_setup
DEFINITION: DEFINE ID;

LENGTH : [0-9]+ ('cm' | 'm' | 'ft' | 'in') ;
YDS_GRADE : ('5.' [0-9] ('+' | '-' | )) | ('5.1' [0-5] ('+' | '-' | [a-d] | )) | '4th' | '3rd';