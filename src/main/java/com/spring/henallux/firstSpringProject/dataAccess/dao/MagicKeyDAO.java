package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.dataAccess.entity.MagicKeyEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.MagicKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MagicKeyDAO {

    private MagicKeyRepository magicKeyRepository;

    @Autowired
    public MagicKeyDAO(MagicKeyRepository magicKeyRepository){
        this.magicKeyRepository = magicKeyRepository;
    }

    public ArrayList<String> getMagicKeys(){
        List <MagicKeyEntity> magicKeyEntities = magicKeyRepository.findAll();
        ArrayList<String> magicKeys = new ArrayList<String>();

        for(MagicKeyEntity keyEntity : magicKeyEntities){
            magicKeys.add(keyEntity.getKey());
        }

        return magicKeys;

        //TODO : Il faut pouvoir gérer les exceptions
    }
}
