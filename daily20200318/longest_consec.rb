def longest_consec(strarr, k)
  str_length = strarr.size
  return "" if str_length == 0 || k > str_length || k <= 0

  from = 0
  result = ""
  new_k = k-1
  while (from + new_k) < str_length
    new_str = ""
    to = from + new_k
    (from..to).each do |key|
      new_str << strarr[key]
    end
    result = new_str if result.size < new_str.size
    from += 1
  end
  result
end