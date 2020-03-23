def removNb(n)
  return [] if n.nil?

  # For more formula sum = n * (n + 1) / 2.0
  sum = (1..n).sum * 1.0
  result = []
  (1..n).each do |a|
    b = (sum - a) / (a+1)
    return [[a, b], [b, a]] if b % 1 == 0 && b > 1 && b < n
  end
  result
end
