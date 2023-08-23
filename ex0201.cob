       identification  		division.
       program-id.		EX0201.
       data			division.
       working-storage		section.
       01 DATA1  pic 9(8) value 140.
       01 DATA2	 pic 9(8) value 240.
       01 DATA3	 pic 9(8).
       01 DATA4	 pic 9(8).
       procedure 		division.
       RUN-START.
      *****足し算*********************************************
         add	DATA1	to	DATA2.
         display	"DATA1="	DATA1	" DATA2="	DATA2.
         add	DATA1	DATA2	giving	DATA3.
         display	"DATA1="	DATA1	" DATA2="	DATA2
	 	" DATA3="	DATA3.
      *****引き算*********************************************
         subtract	DATA1	from	DATA2.
         display	"DATA1="	DATA1	" DATA2="	DATA2.
         subtract	DATA1	from	DATA2	giving	DATA3.
         display	"DATA1="	DATA1	" DATA2="	DATA2
		" DATA3="	DATA3.
      *****掛け算*********************************************
         multiply	DATA1 by	DATA2.
         display	"DATA1="	DATA1	" DATA2="	DATA2.
         multiply	DATA1	by	DATA2	giving	DATA3.
         display	"DATA1="	DATA1	" DATA2="	DATA2
		" DATA3="	DATA3.
      *****割り算*********************************************
         divide	DATA1 into	DATA2.  
         display	"DATA1="	DATA1	" DATA2="	DATA2.
         divide	DATA1 into	DATA2	giving	DATA3.
         display	"DATA1="	DATA1	" DATA2="	DATA2
		" DATA3="	DATA3.
         divide	DATA1 into	DATA2	giving	DATA3 remainder DATA4.
         display	"DATA1="	DATA1	" DATA2="	DATA2
		" DATA3="	DATA3	" 余り="	DATA4.
         stop run.
