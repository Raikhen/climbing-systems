grammar Lang;

// file : block EOF;

// block : named_declaration | func_def | func_call;

yds_grade : YDS_GRADE;
length : LENGTH;

LENGTH : [0-9]+ ('cm' | 'm' | 'ft' | 'in') ;
YDS_GRADE : ('5.' [0-9] ('+' | '-' | )) | ('5.1' [0-5] ('+' | '-' | [a-d] | )) | '4th' | '3rd';