package com.example.gamesDB

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource(collectionResourceRel = "devices", path = "devices")
interface DeviceRepository : CrudRepository <Device, Long>