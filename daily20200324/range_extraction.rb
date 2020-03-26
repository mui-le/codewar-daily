
# solution([-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20])
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
def solution(list)
  result = ""
  list.each_with_index do |value, key|
    str = value.to_s
    if key == 0
      result << str
      next
    end

    if is_adding(list, value, key)
      result << ",%d" % value
      next
    end

    if is_link_by_dash(list, value, key)
      result << "-%d" % value
    end

  end
  result
end

def is_adding(list, value, key)
  list.size == 2 || is_lead(list, value, key) || is_only_two_pairs(list, value, key)
end

def is_lead(list, value, key)
  value != list[key-1] + 1
end

def is_only_two_pairs(list, value, key)
  rst = list[key-2] != list[key-1] - 1 && value == list[key-1] + 1
  return rst if list[key+1].nil?
  rst && list[key+1] - 1 != value
end

def is_link_by_dash(list, value, key)
  list[key+1].nil? || value != (list[key+1] - 1)
end