def presses(phrase)
  arr = ["1", "*", "#", " 0", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9"]
  phrase.upcase.split("").map { |char| arr.select {|x| x.include?(char) }.first.split("").index(char) + 1  }.sum
end