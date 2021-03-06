/*
 * Copyright (c) 2019, Hermetism <https://github.com/Hermetism>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.nightmarezone;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

import java.awt.*;

@ConfigGroup("nightmarezone")
public interface NightmareZoneConfig extends Config {

    @ConfigItem(
            keyName = "swapguzzle",
            name = "Swap Guzzle",
            description = "The amount of absorption doses to drink when a notification is sent",
            position = 1
    )
    default boolean swapGuzzle() {
        return true;
    }

    @ConfigItem(
            keyName = "powersurgenotification",
            name = "Power surge notification",
            description = "Toggles notifications when a power surge power-up appears",
            position = 2
    )
    default boolean powerSurgeNotification() {
        return false;
    }

    @ConfigItem(
            keyName = "recurrentdamagenotification",
            name = "Recurrent damage notification",
            description = "Toggles notifications when a recurrent damage power-up appears",
            position = 3
    )
    default boolean recurrentDamageNotification() {
        return false;
    }

    @ConfigItem(
            keyName = "zappernotification",
            name = "Zapper notification",
            description = "Toggles notifications when a zapper power-up appears",
            position = 4
    )
    default boolean zapperNotification() {
        return false;
    }

    @ConfigItem(
            keyName = "ultimateforcenotification",
            name = "Ultimate Force notification",
            description = "Toggles notifications when an ultimate force power-up appears",
            position = 5
    )
    default boolean ultimateForceNotification() {
        return false;
    }

    @ConfigItem(
            keyName = "overloadnotification",
            name = "Overload notification",
            description = "Toggles notifications when your overload runs out",
            position = 6
    )
    default boolean overloadNotification() {
        return true;
    }

    @ConfigItem(
            keyName = "absorptionnotification",
            name = "Absorption notification",
            description = "Toggles notifications when your absorption points gets below your threshold",
            position = 7
    )
    default boolean absorptionNotification() {
        return true;
    }

    @ConfigItem(
            keyName = "hitpointNotification",
            name = "Hitpoint notification",
            description = "Toggles notifications when your hitpoints gets above your threshold",
            position = 8
    )
    default boolean hitpointNotification() {
        return true;
    }


    @Range(
            min = 1
    )
    @ConfigItem(
            keyName = "absorptionthreshold",
            name = "Absorption Threshold",
            description = "The amount of absorption points to send a notification at",
            position = 9
    )
    default int absorptionThreshold() {
        return 50;
    }

    @Range(
            min = 2
    )
    @ConfigItem(
            keyName = "hitpointsThreshold",
            name = "Hitpoints Threshold",
            description = "The amount of hit points to send a notification at and auto guzzle",
            position = 10

    )
    default int hitpointsThreshold() {
        return 2;
    }

    @ConfigItem(
            keyName = "autoAbsorb",
            name = "Auto Absorption",
            description = "Auto drink Absorption pots when below your threshold",
            position = 11
    )
    default boolean autoAbsorb() {
        return true;
    }

    @ConfigItem(
            keyName = "autoRockCake",
            name = "Auto Rock Cake",
            description = "Auto damage yourself with rock cake when above your threshold",
            position = 12
    )
    default boolean autoRockCake() {
        return true;
    }

    @ConfigItem(
            keyName = "absorbDosesToDrink",
            name = "Absorption Doses",
            description = "The amount of absorption doses to drink when a notification is sent",
            position = 13
    )
    default int absorbDosesToDrink() {
        return 8;
    }

    @ConfigItem(
            keyName = "absorptioncoloroverthreshold",
            name = "Color above threshold",
            description = "Configures the color for the absorption widget when above the threshold",
            position = 14
    )
    default Color absorptionColorAboveThreshold() {
        return Color.YELLOW;
    }

    @ConfigItem(
            keyName = "absorptioncolorbelowthreshold",
            name = "Color below threshold",
            description = "Configures the color for the absorption widget when below the threshold",
            position = 15
    )
    default Color absorptionColorBelowThreshold() {
        return Color.RED;
    }

}
