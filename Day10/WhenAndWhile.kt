fun main (){

    var choice = 2
    when (choice){

        1 -> {
            var sum = 0
            for(i in 1..100){
                if(i%2==0){
                    sum += i;
                }
            }
            println("The sum of even numbers upto 100 is : $sum")
        }
        2 -> {
            var sum = 0
            for(i in 1..100){
                if(i%2!=0){
                    sum+=i
                }
            }
            println("The sum of odd numbers upto 100 is : $sum")
        }
    }
}
