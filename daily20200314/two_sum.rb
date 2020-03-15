def two_sum(numbers, target)
  result = []
  hash_numbers = numbers.map.with_index.to_h
  numbers.each_with_index do |value, key|
    sub = target - value
    result << [key, hash_numbers[sub]] if hash_numbers.has_key?(sub) 
  end
  result
end