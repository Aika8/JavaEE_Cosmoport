package com.space.service.impl;


import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;
import com.space.repository.ShipRepository;
import com.space.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ShipServiceImpl implements ShipService {

    @Autowired
    private ShipRepository shipRepository;

    public ShipServiceImpl() {
    }


    @Override
    public Ship saveShip(Ship ship) {
        return null;
    }

    @Override
    public Ship getShip(Long id) {
        return null;
    }

    @Override
    public Ship updateShip(Ship oldShip, Ship newShip) throws IllegalArgumentException {
        return null;
    }

    @Override
    public void deleteShip(Ship ship) {

    }

    @Override
    public List<Ship> getShips(String name, String planet, ShipType shipType, Long after, Long before, Boolean isUsed, Double minSpeed, Double maxSpeed, Integer minCrewSize, Integer maxCrewSize, Double minRating, Double maxRating) {
        return null;
    }

    @Override
    public List<Ship> sortShips(List<Ship> ships, ShipOrder order) {
        return null;
    }

    @Override
    public List<Ship> getPage(List<Ship> ships, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public boolean isShipValid(Ship ship) {
        return false;
    }

    @Override
    public double computeRating(double speed, boolean isUsed, Date prod) {
        return 0;
    }
}
