identification     division.
program-id.        ex0403.
data               division.
working-storage    section.
01  COUNTER        pic 9(8)  value  zero.
procedure          division.
RTN-START.
    perform  until  COUNTER  >  15
       display  "回数="  COUNTER
       add  1  to  COUNTER
    end-perform.
    stop run.
