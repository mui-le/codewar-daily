def isPrime(num)
  num < 2 ? false : (num <= 3 || (3..(num**0.5 + 1).round).select { |n| num % n == 0 }.none? )
end