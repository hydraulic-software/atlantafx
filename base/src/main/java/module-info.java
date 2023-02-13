/* SPDX-License-Identifier: MIT */

module atlantafx.base {

    requires transitive javafx.controls;
    requires static org.jetbrains.annotations;

    exports atlantafx.base.controls;
    exports atlantafx.base.theme;
    exports atlantafx.base.util;

    opens atlantafx.base.theme;
}
