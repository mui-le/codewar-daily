def validSolution(board)
  collections = board | columns(board) | blocks(board)
  collections.all? { |collection| collection.to_set == [1,2,3,4,5,6,7,8,9].to_set }
end

def columns(board)
  board.transpose
end

def blocks(board)
  board.map{|row| row.each_slice(3).to_a }.transpose.flatten.each_slice(9).to_a
end
