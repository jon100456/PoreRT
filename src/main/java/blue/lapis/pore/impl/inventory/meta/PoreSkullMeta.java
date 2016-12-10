/*
 * Pore(RT)
 * Copyright (c) 2014-2016, Lapis <https://github.com/LapisBlue>
 * Copyright (c) 2014-2016, Contributors
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package blue.lapis.pore.impl.inventory.meta;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.inventory.meta.SkullMeta;
import org.spongepowered.api.item.inventory.ItemStack;

// TODO: bridge

// TODO: bridge

public class PoreSkullMeta extends PoreItemMeta implements SkullMeta {

    public PoreSkullMeta(ItemStack holder) {
        super(holder);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getOwner() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean hasOwner() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean setOwner(String owner) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public SkullMeta clone() {
        throw new NotImplementedException("TODO");
    }

}
