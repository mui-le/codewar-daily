def digital_root(n)
  # 2123.digits == [3, 2, 1, 2]
  n < 10 ? n : digital_root(n.digits.sum)
end
