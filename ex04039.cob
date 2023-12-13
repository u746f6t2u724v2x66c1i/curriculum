identification     division.
program-id.        ex04035.
data               division.
working-storage    section.
01  DATA1          pic 9(3).
01  DATA2          pic 9(3).
01  COUNTER        pic 9(8) value zero.
procedure          division.
RTN-START.
    display  "何回繰り返す？".
    accept  DATA1.
    display  "初期値は？".
    accept  COUNTER.
    display  "増分値は？".
    accept  DATA2.
    perform  RTN-COUNT  DATA1  times
    stop run.
RTN-COUNT.
    display  "回数="  COUNTER
    add  DATA2  to  COUNTER.  
