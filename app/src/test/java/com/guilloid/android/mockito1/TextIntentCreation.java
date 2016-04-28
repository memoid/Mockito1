package com.guilloid.android.mockito1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by gmoro on 4/27/2016.
 */
public class TextIntentCreation {

    @Test
    public void testIntentShouldCreated() {

        Context context = Mockito.mock(Context.class);
        Intent intent = MainActivity.createQuery(context, "query", "value");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("query", extras.getString("QUERY"));
        assertEquals("value", extras.getString("VALUE"));

    }

}
