identification     division.
program-id.        ex0303.
data               division.
working-storage    section.
01  DATA1          pic 9.
procedure          division.
RTN-START.
     accept DATA1.
     evaluate DATA1
       when 1         display "1を入力"
       when 2         display "2を入力"
       when 3 thru 6  display "3~6を入力"
       when other     display "1~6以外を入力"
     end-evaluate.
     stop run.
