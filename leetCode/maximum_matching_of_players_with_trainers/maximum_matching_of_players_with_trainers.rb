def match_players_and_trainers(players, trainers)
  matchNum = 0
  player = players.sort
  trainer = trainers.sort

  i = 0
  j = 0

  while i < player.length && j < trainer.length
    if player[i] <= trainer[j]
      matchNum += 1
      i += 1
      j += 1
    else
      j += 1
    end
  end

  return matchNum
end

players = [4, 7, 9]
trainers = [8, 2, 5, 8]
result = match_players_and_trainers(players, trainers)
puts result
