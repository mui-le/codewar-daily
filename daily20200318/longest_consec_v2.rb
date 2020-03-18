def longest_consec(strarr, k)
  n = strarr.size
  return "" if n == 0 || k > n || k <= 0
  strarr.each_cons(k).map(&:join).max_by(&:length) || ""
end