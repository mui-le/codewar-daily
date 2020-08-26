def part(n)
  prod = enum(n).map{|x| x.inject(&:*) }.uniq.sort
  "Range: %d Average: %0.2f Median: %0.2f" % [prod.max - prod.min, average(prod), median(prod)]
end

def median(prod)
  length = prod.size
  return prod[length/2] if length % 2 == 1

  p1 = prod[length/2]
  p2 = prod[length/2 - 1]
  (p1 + p2).to_f/2
end

def average(prod)
  prod.sum.to_f/prod.size
end

# enum(4) -> [[4],[3,1],[2,2],[2,1,1],[1,1,1,1]] and
# enum(5) -> [[5],[4,1],[3,2],[3,1,1],[2,2,1],[2,1,1,1],[1,1,1,1,1]]
def enum(value, max = value)
  if value == 0
    [[]]
  else
    1.upto(max).flat_map do |n|
      enum(value - n, [value, n].min).map do |ns|
        [n] + ns
      end
    end
  end
end