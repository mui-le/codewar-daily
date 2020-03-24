# after prefer other solutions
def solution_2(list)
  list.chunk_while {|n1, n2| n2-n1 == 1 }.map { |gr| gr.size > 2 ? "#{gr.first}-#{gr.last}" : gr}.join(',')
end