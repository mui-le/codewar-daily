def data_reverse(data)
  data.join.scan(/.{8}/).reverse.join.split('').map(&:to_i)
end