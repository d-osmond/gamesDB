package com.example.gamesDB



import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name="DEVICES")
data class Device (

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        var deviceId: Long = -1,

        @Column(name="deviceName")
        var deviceName: String="",

        @Column(name="platform")
        var platform: String="",

        @Column(name="format")
        var format: String="",

        @Column(name="notes")
        var notes: String=""
)