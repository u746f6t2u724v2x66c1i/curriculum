identification     division.
program-id.        ex0402.
data               division.
working-storage    section.
01  COUNTER        pic 9(3) value zero.
procedure          division.
RTN-START.
    perform  15  times
       display  "回数="  COUNTER
       add  1  to  COUNTER
    end-perform.
    stop run.
