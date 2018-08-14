package net.yslibrary.simplepreferences.example;

import net.yslibrary.simplepreferences.annotation.Key;
import net.yslibrary.simplepreferences.annotation.Preferences;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yshrsmz on 2016/02/24.
 */
@Preferences(useDefault = true)
public class ValidPrefsWithDefaultName {

  @Key
  protected String stringValue = "";
  @Key
  protected int intValue = 0;
  @Key
  protected float floatValue = 0f;
  @Key
  protected long longValue = 0L;
  @Key
  protected Set<String> stringSetValue = new HashSet<>();
}
