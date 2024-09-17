identification     division.
program-id.        ex04034.
data               division.
working-storage    section.
01  DATA1          pic 9(2).
01  DATA2          pic 9(2).
01  COUNTER        pic 9(8) value zero.
procedure          division.
RTN-START.
    display  "初期値は?". 
    accept  COUNTER.
    display  "増分値は?". 
    accept  DATA2.
    perform  6  times
       display  "回数="  COUNTER
       add  DATA2  to  COUNTER
    end-perform.
    stop run.
