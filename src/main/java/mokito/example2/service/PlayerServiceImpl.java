package mokito.example2.service;

import mokito.example2.persistence.Player;
import mokito.example2.persistence.entity.repository.PlayerRepositoryImpl;

import java.util.List;

public class PlayerServiceImpl implements IPlayerService
{
    private final PlayerRepositoryImpl playerRepository;

    public PlayerServiceImpl(PlayerRepositoryImpl playerRepository)
    {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> findAll()
    {
        return playerRepository.findAll();
    }

    @Override
    public Player findById(Long id)
    {
        return playerRepository.findById(id);
    }

    @Override
    public void save(Player player)
    {
        this.playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long id)
    {
        this.playerRepository.deletePlayer(id);
    }
}
