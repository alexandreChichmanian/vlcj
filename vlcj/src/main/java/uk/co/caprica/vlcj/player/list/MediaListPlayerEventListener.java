/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010, 2011 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player.list;

import uk.co.caprica.vlcj.binding.internal.libvlc_media_t;

/**
 *
 */
public interface MediaListPlayerEventListener {

  /**
   * Place-holder, do not use.
   * 
   * <strong>Warning: the native media list player event manager reports that 
   * it does not support this event.</strong>
   * 
   * @param mediaListPlayer
   */
  void played(MediaListPlayer mediaListPlayer);

  /**
   * The media list player started playing the next item in the list.
   * 
   * @param mediaListPlayer media list player
   * @param item next item instance
   */
  void nextItem(MediaListPlayer mediaListPlayer, libvlc_media_t item);

  /**
   * Place-holder, do not use.
   * 
   * <strong>Warning: the native media list player event manager reports that 
   * it does not support this event.</strong>
   * 
   * @param mediaListPlayer
   */
  void stopped(MediaListPlayer mediaListPlayer);
}