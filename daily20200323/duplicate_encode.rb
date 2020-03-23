def duplicate_encode word
  new_word = word.downcase
  new_word.split('').map { |c| new_word.count(c) > 1 ? ")" : "("}
end