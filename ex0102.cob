       identification division.
       program-id. EX0102.

       data division.
       working-storage section.
       01 DATA1 pic x(80).

       procedure division.
           display "Enter data: "
           accept DATA1
           display "You entered: ", DATA1
           stop run.
