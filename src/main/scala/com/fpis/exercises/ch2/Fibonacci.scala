import scala.annotation.tailrec

object Fibonacci {

	/* calculate the nth Fibonacci number */
	def fib(n: Int): Int = {
		/*
		 * first numbers, 0, 1
		 */

		@tailrec	
		def loop(n: Int, last: Int, secLast: Int): Int = {
			if (n == 0) last
			else loop(n-1, last + secLast, last)
		}

		loop(n, 0, 1)
		
	}

	def main(args: Array[String]): Unit = {
		// 10 55
		val fibTen = fib(10)
		println("Fibonacci number 10: " + fibTen)
		// 40 102334155
		val fibFourty = fib(40)	
		println("Fibonacci number 40: " + fibFourty)
	}
} 
