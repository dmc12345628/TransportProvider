package fr.lr.iut.transportprovider.providers;

import android.net.Uri;

/**
 * The Providers constants
 *
 * @author Jesús Daniel Medina Cruz
 * @since 07/12/2017
 */

public abstract class PC {
    public static abstract class Transport {
        public static final String
                PROVIDER_NAME = "fr.lr.iut.transportprovider.providers.Transport";

        public static final int
                TRANSPORT_ITEM = 1,
                TRANSPORT_DIR = 2;
    }
}
