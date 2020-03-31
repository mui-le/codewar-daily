def wave(str)
  str.size.times.map {|k| str[k] == " " ? nil : (new_str = str.dup; new_str[k] = new_str[k].upcase; new_str)}.compact
end