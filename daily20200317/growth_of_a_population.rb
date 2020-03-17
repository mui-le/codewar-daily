def nb_year(p0, percent, aug, p)
  nb_year = 0
  while p0 < p
    p0 = p0 + (p0*percent/100).floor + aug
    nb_year += 1
  end
  nb_year
end