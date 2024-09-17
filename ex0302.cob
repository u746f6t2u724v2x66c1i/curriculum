identification     division.
program-id.        ex0302.
data               division.
working-storage    section.
01  DATA1          pic 9.
procedure          division.
RTN-START.
     accept DATA1.
     if  DATA1 = 1  then
        display "1を入力"
     else
         if  DATA1 = 2  then
            display "2を入力"
         else
             if  DATA1 >= 3 and DATA1 <= 6  then
                display "3~6を入力"
                else
                    display "1~6以外を入力".
      stop run.
