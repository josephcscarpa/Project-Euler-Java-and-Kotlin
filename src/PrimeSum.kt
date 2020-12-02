var primes:ArrayList<Int> = ArrayList();
fun findPrimeSumBelow(n:Int):Long {
    var sum: Long = 0;
    for (i in 2..n){
        println(i);
         if(isPrime(i)) {
             print("adding"+i);
             sum += i;
         }
        println(sum);
    }
    return sum;
}

fun isPrime(n:Int):Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 === 0 || n % 3 === 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i === 0 || n % (i + 2) === 0) return false
        i = i + 6
    }


    return true
}
fun main(){
    println(findPrimeSumBelow(2000000));
}
