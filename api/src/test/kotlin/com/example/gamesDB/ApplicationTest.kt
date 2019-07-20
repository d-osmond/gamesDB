package com.example.gamesDB


import org.jsmart.zerocode.core.domain.JsonTestCase
import org.jsmart.zerocode.core.domain.TargetEnv
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner
import org.junit.Test
import org.junit.runner.RunWith


@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner::class)
class ApplicationHTMLTests{


    @Test
    @JsonTestCase("integration_tests/post/create_new_device.json")
    fun `create new device`(){


    }


    @Test
    @JsonTestCase("integration_tests/get/get_all_devices.json")
    fun `gets all devices`(){


    }

    @Test
    @JsonTestCase("integration_tests/patch/patch_device_profile.json")
    fun `patches device profile`(){


    }


}