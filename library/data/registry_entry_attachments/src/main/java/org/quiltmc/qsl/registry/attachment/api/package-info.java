/**
 * <h2>Registry Entry Attachments</h2>
 *
 * <p>
 * A simple API for adding arbitrary values to any instances managed by a {@link net.minecraft.util.registry.Registry Registry}.
 * <p>
 * {@link org.quiltmc.qsl.registry.attachment.api.RegistryEntryAttachment RegistryEntryAttachment} contains a number of methods for building
 * new attachments.
 * <p>
 * To retrieve an attachment's value, use {@link org.quiltmc.qsl.registry.attachment.api.RegistryEntryAttachment#getValue(java.lang.Object)}
 * to get the value assigned to the specified registry entry.
 *
 * <p><h3>Vocabulary</h3>
 *
 * <ul>
 *     <li>Attachment values set in-code (using
 *     {@link org.quiltmc.qsl.registry.attachment.api.RegistryExtensions#register(net.minecraft.util.registry.Registry, net.minecraft.util.Identifier, java.lang.Object, java.util.function.Consumer)})
 *     are referred to as "built-in" values.</li>
 * </ul>
 *
 *
 * <h3>Data-Driven Capabilities</h3>
 * <p>
 * All attachments declared using this API can be set using a data pack (or a resource pack, if the attachment is client-side)!
 * Simply create the following file:<br>
 * {@code <data|assets>/<attachment_namespace>/attachments/<registry_key_path>/<attachment_name>.json}
 * <p>
 * These "attachment dictionaries" use a tag-like format, with a {@code replace} property that allows replacing all (non built-in) values.
 * <p>
 * The {@code values} object functions as a map, mapping registry entry IDs to attachment values.
 * <p>
 * For example, say we have an {@code Integer} attachment for the {@code Item} registry with an ID of {@code example_mod:coolness}.<br>
 * To set Netherite Pickaxe's coolness to 20, we create this file at {@code data/example_mod/attachments/minecraft/item/coolness.json}:
 * <pre><code>
 * {
 *   "replace": false,
 *   "values": {
 *     "minecraft:netherite_pickaxe": 20
 *   }
 * }
 * </code></pre>
 */

package org.quiltmc.qsl.registry.attachment.api;
