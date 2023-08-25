       IDENTIFICATION DIVISION.
       PROGRAM-ID. SalaryCalculator.

       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 EMPLOYEE-RECORD.
           05 EMPLOYEE-ID     PIC 9(5).
           05 SALARY          PIC S9(7)V99.

       01 TOTAL-SALARY      PIC S9(9)V99 VALUE 0.
       01 EMPLOYEE-COUNT    PIC 9(5) VALUE 0.
       01 AVERAGE-SALARY    PIC S9(9)V99.

       PROCEDURE DIVISION.
       RUN-START.
          DISPLAY "Enter employee ID (0 to exit): ".
          ACCEPT EMPLOYEE-ID.
          IF EMPLOYEE-ID NOT = 0
              DISPLAY "Enter salary: "
              ACCEPT SALARY
              ADD SALARY TO TOTAL-SALARY
              ADD 1 TO EMPLOYEE-COUNT
          END-IF.

          IF EMPLOYEE-COUNT > 0
              COMPUTE AVERAGE-SALARY = TOTAL-SALARY / EMPLOYEE-COUNT
              DISPLAY "Average salary: ", AVERAGE-SALARY
          ELSE
              DISPLAY "No data entered."
          END-IF.

          GOBACK.
