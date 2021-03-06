package adventofcode

import adventofcode._
import org.scalatest.funsuite._
import adventofcode.day1.Day1
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source
import adventofcode.day1.Day2
import scala.util.matching.Regex

class Day2Spec extends AnyWordSpec with Matchers {
  "day 2 example" in {
    val lines = """1-3 a: abcde
1-3 b: cdefg
2-9 c: ccccccccc""".split(System.lineSeparator()).toList

    Day2.solve(lines) shouldBe 2
  }

  "day 2" should {
    val lines = Source.fromResource("day2/passwords.txt").getLines().toSeq
    
    "part 1" in {
      val ans = Day2.solve(lines)
      println("Day 2 part I : " + ans)

      ans shouldBe 467
    }

    "part 2" in {
      val ans = Day2.solve2(lines)
      println("Day 2 part II : " + ans)

      ans shouldBe 441
    }
  }
}
