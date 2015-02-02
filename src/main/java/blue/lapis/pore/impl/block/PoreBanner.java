/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
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
package blue.lapis.pore.impl.block;

import blue.lapis.pore.converter.wrapper.PoreConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.DyeColor;
import org.bukkit.block.banner.Pattern;
import org.spongepowered.api.block.BlockState;

import java.util.List;

public class PoreBanner extends PoreBlockState implements org.bukkit.block.Banner {

    public static PoreBanner of(BlockState handle) {
        return PoreConverter.of(PoreBanner.class, handle);
    }

    protected PoreBanner(BlockState handle) {
        super(handle);
    }

    @Override
    public DyeColor getBaseColor() {
        throw new NotImplementedException();
    }

    @Override
    public void setBaseColor(DyeColor color) {
        throw new NotImplementedException();
    }

    @Override
    public List<Pattern> getPatterns() {
        throw new NotImplementedException();
    }

    @Override
    public void setPatterns(List<Pattern> patterns) {
        throw new NotImplementedException();
    }

    @Override
    public void addPattern(Pattern pattern) {
        throw new NotImplementedException();
    }

    @Override
    public Pattern getPattern(int i) {
        throw new NotImplementedException();
    }

    @Override
    public Pattern removePattern(int i) {
        throw new NotImplementedException();
    }

    @Override
    public void setPattern(int i, Pattern pattern) {
        throw new NotImplementedException();
    }

    @Override
    public int numberOfPatterns() {
        throw new NotImplementedException();
    }
}