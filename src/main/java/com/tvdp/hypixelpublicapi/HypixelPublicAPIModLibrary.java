package com.tvdp.hypixelpublicapi;

import com.tvdp.hypixelpublicapi.error.PublicAPIKeyMissingException;
import net.hypixel.api.HypixelAPI;
import net.tascalate.concurrent.Promise;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface HypixelPublicAPIModLibrary
{
    <T> Promise<T> handleHypixelAPIRequest(Function<HypixelAPI, CompletableFuture<T>> apiRequestFunc) throws PublicAPIKeyMissingException;
}
