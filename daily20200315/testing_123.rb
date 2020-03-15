def number lines
  return [] if lines.empty?
  lines.map.with_index(1) { |item, index| "#{index}: #{item}"}
end