def validate(n)
  numbers = n.to_s.chars.map(&:to_i)
  replace_numbers = {0 => 0, 1 => 2, 2 => 4, 3 => 6, 4 => 8, 5 => 1, 6 => 3, 7 => 5, 8 => 7, 9 => 9 }
  sum = numbers.reverse.each_with_index.map {|value, key| key % 2 == 0 ? value : replace_numbers[value] }.sum
  sum % 10 == 0
end
