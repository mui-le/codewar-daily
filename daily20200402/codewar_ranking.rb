class User

  RANK_LIST = [-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8]

  attr_accessor :rank, :progress

  def initialize
    @rank = ranks[0]
    @progress = 0
  end
  
  def ranks
    @rank_list ||= Hash[RANK_LIST.map.with_index { |x, i| [i, x] }]
  end

  def inc_progress(activity_rank)
    raise "error occured" unless RANK_LIST.include?(activity_rank)

    return @progress = 0 if @rank >= 8

    @progress += caculate_progress(activity_rank)
    return @progress if @progress < 100
    
    upgrade_ranking
    @progress = 0 if @rank >= 8
  end

  def upgrade_ranking
    current_rank = ranks.key(@rank)
    enhance      = @progress / 100
    @rank        = ranks[current_rank + enhance]
    @progress    = @progress % 100
  end
  
  def caculate_progress(activity_rank)
    sub = ranks.key(activity_rank) - ranks.key(@rank)
    return 3 if sub == 0
    return 1 if sub <= -1

    10 * sub**2
  end
end