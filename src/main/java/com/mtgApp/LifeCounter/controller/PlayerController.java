package com.mtgApp.LifeCounter.controller;

import com.mtgApp.LifeCounter.entity.Player;
import com.repository.PlayerRepo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Table")
public class PlayerController {

    private final Logger log = LoggerFactory.getLogger(PlayerController.class);
    private final PlayerRepo playerRepo;

    public PlayerController(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerRepo.findAll();
    }

    @GetMapping("/{playerId}")
    public Player getPlayer(@PathVariable Long id) {
        return playerRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) throws URISyntaxException {
        log.info("Request to create Player");
        Player savedPlayer = playerRepo.save(player);
        return ResponseEntity.created(new URI("/players" + savedPlayer.getPlayerId())).body(savedPlayer);
    }
}
