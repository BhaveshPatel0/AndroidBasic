# AndroidBasic
AndriodBasics

For Loop Example And Nullable variable With Return Type 

 fun patternForLoop(number: Int,star:String?=null): String {

        var output = ""

        for (column in 1..number) {

            for (row in number downTo column ) {
                    if (star==null){
                        output = output.plus(column)
                    }
                else{
                        output = output.plus(star)
                    }

                Log.d("TAG", "patternForLoop: $column")

            }
            output=output.plus("\n")
        }

        return output
    }

Output:-

![Screenshot (59)](https://github.com/BhaveshPatel0/AndroidBasic/assets/138680591/0c7816aa-25ea-4f8d-8111-476ab40a4f52)

    
